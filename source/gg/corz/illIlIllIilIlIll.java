package gg.corz;

import java.util.List;
import java.util.Set;

public record illIlIllIilIlIll(long id, lIIlllliIIllll result, IIilliIllIilliIl schematicTarget, IIilliIllIilliIl dirtGoal, IIilliIllIilliIl start, IIilliIllIilliIl firstConstructionStand, IIilliIllIilliIl finalSupportStand, IIilliIllIilliIl finalSchematicPlacementStand, List<lliiIiililiiIiil> steps, Set<IIilliIllIilliIl> plannedDirt, Set<IIilliIllIilliIl> reusedOwnedDirt, boolean egressSafe, int firstActionCandidates, int exploredStates, long fingerprint) {
   private final IIilliIllIilliIl liIiIillll;
   private final lIIlllliIIllll ilIiIillll;
   private final long llIiIillll;
   private final int liliIillll;
   private final IIilliIllIilliIl IiIiIillll;
   private final IIilliIllIilliIl iIliIillll;
   private final Set<IIilliIllIilliIl> illiIillll;
   private final List<lliiIiililiiIiil> IlliIillll;
   private final boolean IiliIillll;
   private final int iiliIillll;
   private final IIilliIllIilliIl iiIiIillll;
   private final IIilliIllIilliIl lIliIillll;
   private final Set<IIilliIllIilliIl> llliIillll;
   private final IIilliIllIilliIl IIliIillll;
   private final long IIiiIillll;

   public boolean IliIlllilIi() {
      return this.ilIiIillll == lIIlllliIIllll.IliIiliillliIiliil;
   }

   public IIilliIllIilliIl lIiiIiIlilli() {
      return this.liIiIillll;
   }

   public long IIIilIIiiIIi() {
      return this.IIiiIillll;
   }

   public IIilliIllIilliIl IiIlliIliiIl() {
      return this.iIliIillll;
   }

   public int Iiilliiliiil() {
      return this.iiliIillll;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.IiIiIillll;
   }

   public Set<IIilliIllIilliIl> Illlllllilll() {
      return this.llliIillll;
   }

   public Set<IIilliIllIilliIl> Iilllilliill() {
      return this.illiIillll;
   }

   public illIlIllIilIlIll(long exploredStates, lIIlllliIIllll schematicTarget, IIilliIllIilliIl dirtGoal, IIilliIllIilliIl fingerprint, IIilliIllIilliIl reusedOwnedDirt, IIilliIllIilliIl finalSchematicPlacementStand, IIilliIllIilliIl id, IIilliIllIilliIl firstActionCandidates, List<lliiIiililiiIiil> plannedDirt, Set<IIilliIllIilliIl> start, Set<IIilliIllIilliIl> steps, boolean firstConstructionStand, int egressSafe, int finalSupportStand, long result) {
      plannedDirt = List.copyOf(plannedDirt == null ? List.of() : plannedDirt);
      start = Set.copyOf(start == null ? Set.of() : start);
      steps = Set.copyOf(steps == null ? Set.of() : steps);
      this.llIiIillll = exploredStates;
      this.ilIiIillll = schematicTarget;
      this.IiIiIillll = dirtGoal;
      this.liIiIillll = fingerprint;
      this.iiIiIillll = reusedOwnedDirt;
      this.IIliIillll = finalSchematicPlacementStand;
      this.lIliIillll = id;
      this.iIliIillll = firstActionCandidates;
      this.IlliIillll = plannedDirt;
      this.llliIillll = start;
      this.illiIillll = steps;
      this.IiliIillll = firstConstructionStand;
      this.liliIillll = egressSafe;
      this.iiliIillll = finalSupportStand;
      this.IIiiIillll = result;
   }

   public lIIlllliIIllll iIlIlllllill() {
      return this.ilIiIillll;
   }

   public int Ililllililil() {
      return this.liliIillll;
   }

   public IIilliIllIilliIl IlIlllIlilIl() {
      return this.lIliIillll;
   }

   public List<lliiIiililiiIiil> IIlllIlliIll() {
      return this.IlliIillll;
   }

   public long liiiIIllIl() {
      return this.llIiIillll;
   }

   public boolean IIillIiliIil() {
      return this.IiliIillll;
   }

   public IIilliIllIilliIl iliIiiliiiii() {
      return this.iiIiIillll;
   }

   public IIilliIllIilliIl IIIllIIliIIl() {
      return this.IIliIillll;
   }
}
