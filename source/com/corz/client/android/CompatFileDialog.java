package com.corz.client.android;

import java.awt.Dialog;
import java.awt.Frame;
import java.io.FilenameFilter;
import java.nio.file.Path;

/**
 * Drop-in ASM replacement for java.awt.FileDialog in compiled gg.corz.* classes.
 * Prevents AWTError/HeadlessException on Android / Mojo Launcher by delegating to
 * AndroidFilePicker while keeping the FileDialog method surface compatible.
 */
public class CompatFileDialog {
   private String title;
   private final int mode;
   private String filterPattern;
   private String selectedDirectory;
   private String selectedFile;

   public CompatFileDialog(Frame owner) {
      this(owner, "", 0);
   }

   public CompatFileDialog(Frame owner, String title) {
      this(owner, title, 0);
   }

   public CompatFileDialog(Frame owner, String title, int mode) {
      this.title = title;
      this.mode = mode;
   }

   public CompatFileDialog(Dialog owner) {
      this(owner, "", 0);
   }

   public CompatFileDialog(Dialog owner, String title) {
      this(owner, title, 0);
   }

   public CompatFileDialog(Dialog owner, String title, int mode) {
      this.title = title;
      this.mode = mode;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getTitle() {
      return this.title;
   }

   public int getMode() {
      return this.mode;
   }

   public void setFile(String file) {
      this.filterPattern = file;
   }

   public void setDirectory(String dir) {
      this.selectedDirectory = dir;
   }

   public void setFilenameFilter(FilenameFilter filter) {
   }

   public void setAlwaysOnTop(boolean alwaysOnTop) {
   }

   public void setModal(boolean modal) {
   }

   public void toFront() {
   }

   public void requestFocus() {
   }

   public void dispose() {
   }

   public void setVisible(boolean visible) {
      if (!visible) {
         return;
      }
      Path selected = AndroidFilePicker.pickFile(
         this.title != null ? this.title : "Select file",
         this.filterPattern,
         Path.of("."),
         ".litematic", ".schem", ".schematic", ".nbt", ".json"
      );
      if (selected != null && selected.getParent() != null) {
         this.selectedDirectory = selected.getParent().toString();
         this.selectedFile = selected.getFileName().toString();
      }
   }

   public String getDirectory() {
      return this.selectedDirectory;
   }

   public String getFile() {
      return this.selectedFile;
   }
}
