package fr.utbm.info.ia51.ar.agents;

import com.google.common.base.Objects;
import fr.utbm.info.ia51.ar.behaviors.InitiateAgentBehavior;
import fr.utbm.info.ia51.ar.behaviors.participant;
import fr.utbm.info.ia51.ar.capacities.NativeCapacity;
import fr.utbm.info.ia51.ar.events.ConfirmInitiator;
import fr.utbm.info.ia51.ar.events.EndRenegotiation;
import fr.utbm.info.ia51.ar.events.askToBeInitiator;
import fr.utbm.info.ia51.ar.events.perturbation;
import fr.utbm.info.ia51.ar.requirements.ChildrenCategory;
import fr.utbm.info.ia51.ar.requirements.DriverLicense;
import fr.utbm.info.ia51.ar.requirements.Gender;
import fr.utbm.info.ia51.ar.requirements.HouseholdAge;
import fr.utbm.info.ia51.ar.requirements.HouseholdComposition;
import fr.utbm.info.ia51.ar.requirements.IncomeCategory;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import fr.utbm.info.ia51.ar.requirements.WorkStatus;
import fr.utbm.info.ia51.ar.skills.NativeSkill;
import io.sarl.core.Behaviors;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.core.Initialize;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Behavior;
import io.sarl.lang.core.BuiltinCapacitiesProvider;
import io.sarl.lang.core.DynamicSkillProvider;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * <p> This class define the mind and the body for agent.
 * In this project we considering agent as all the participant
 * to a trip or activity.
 * </p>
 * 
 * @author komi AGOTSI
 * @author Lilian Durand
 * @author Koffi Agbenya
 */
@XmlRootElement(name = "Person")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(19)
@SuppressWarnings("all")
public class Person extends Agent {
  private List<Schedule> schedules;
  
  private int id;
  
  private String name;
  
  private int age;
  
  private Gender gender;
  
  private DriverLicense isDriver;
  
  private WorkStatus workStatus;
  
  private HouseholdAge houseHoldAge;
  
  private HouseholdComposition houseHoldComposition;
  
  private ChildrenCategory childrenCategory;
  
  private IncomeCategory incomeCategory;
  
  private List<Person> myRelations;
  
  private Behavior actualBehavior;
  
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    this.actualBehavior = null;
    NativeSkill _nativeSkill = new NativeSkill();
    this.<NativeSkill>setSkill(_nativeSkill);
  }
  
  private void $behaviorUnit$perturbation$1(final perturbation occurrence) {
    NativeCapacity _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER = this.$castSkill(NativeCapacity.class, (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) ? (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = this.$getSkill(NativeCapacity.class)) : this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY);
    boolean _isPerturbationImpacting = _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER.isPerturbationImpacting(occurrence);
    if (_isPerturbationImpacting) {
      Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
      _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER.unregisterBehavior(this.actualBehavior);
      participant _participant = new participant(this);
      this.actualBehavior = _participant;
      Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER_1 = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
      _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER_1.registerBehavior(this.actualBehavior);
      NativeCapacity _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER_1 = this.$castSkill(NativeCapacity.class, (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) ? (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = this.$getSkill(NativeCapacity.class)) : this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY);
      boolean _wantsToBeInitiator = _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER_1.wantsToBeInitiator();
      if (_wantsToBeInitiator) {
        DefaultContextInteractions _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER = this.$castSkill(DefaultContextInteractions.class, (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = this.$getSkill(DefaultContextInteractions.class)) : this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS);
        askToBeInitiator _askToBeInitiator = new askToBeInitiator();
        _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER.emit(_askToBeInitiator);
      }
    }
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$perturbation$1(final perturbation it, final perturbation occurrence) {
    boolean _equals = Objects.equal(this.actualBehavior, null);
    return _equals;
  }
  
  private void $behaviorUnit$perturbation$2(final perturbation occurrence) {
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$perturbation$2(final perturbation it, final perturbation occurrence) {
    boolean _notEquals = (!Objects.equal(this.actualBehavior, null));
    return _notEquals;
  }
  
  private void $behaviorUnit$ConfirmInitiator$3(final ConfirmInitiator occurrence) {
    Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
    _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER.unregisterBehavior(this.actualBehavior);
    InitiateAgentBehavior _initiateAgentBehavior = new InitiateAgentBehavior(this);
    this.actualBehavior = _initiateAgentBehavior;
    Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER_1 = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
    _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER_1.registerBehavior(this.actualBehavior);
  }
  
  private void $behaviorUnit$EndRenegotiation$4(final EndRenegotiation occurrence) {
    Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
    _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER.unregisterBehavior(this.actualBehavior);
    this.actualBehavior = null;
  }
  
  /**
   * @return  List<Schedule>
   * 						List of Schedule of agent
   */
  @Pure
  protected List<Schedule> getSchedules() {
    return this.schedules;
  }
  
  /**
   * @param List<Schedule>
   * 					List of Schedule of the agent
   */
  @XmlElement(name = "schedules")
  protected void setSchedules(final List<Schedule> Schedules) {
    this.schedules = Schedules;
  }
  
  /**
   * @return  List<AgentUUID>
   * List of relations of the agent with others agents
   */
  @Pure
  protected List<Person> getRelations() {
    return this.getRelations();
  }
  
  /**
   * @param List<AgentUUID>
   * List of relations of the agent with others agents
   */
  @XmlElement(name = "myrelations")
  protected void setRelations(final List<Person> myRelations) {
    this.myRelations = myRelations;
  }
  
  /**
   * @return id
   * id of agent
   */
  @Pure
  protected int getId() {
    return this.id;
  }
  
  /**
   * @param id
   * id of  agent
   */
  @XmlElement(name = "id")
  protected void setId(final int id) {
    this.id = id;
  }
  
  /**
   * @return name
   * name of agent
   */
  @Pure
  protected String getName() {
    return this.name;
  }
  
  /**
   * @param name
   * name of  agent
   */
  @XmlElement(name = "name")
  protected void setName(final String name) {
    this.name = name;
  }
  
  /**
   * @return gender
   * gender of agent
   */
  @Pure
  protected Gender getGender() {
    return this.gender;
  }
  
  /**
   * @param gender
   * gender of  agent
   */
  @XmlElement(name = "gender")
  protected void setGender(final Gender gender) {
    this.gender = gender;
  }
  
  /**
   * @return age
   * age of agent
   */
  @Pure
  protected int getAge() {
    return this.age;
  }
  
  /**
   * @param age
   * age of  agent
   */
  @XmlElement(name = "age")
  protected void setAge(final int age) {
    this.age = age;
  }
  
  /**
   * @return driver licence
   * verify if the agent has a driver licence
   */
  @Pure
  protected DriverLicense isDriver() {
    return this.isDriver();
  }
  
  /**
   * @param driver licence
   * if driver licence   agent
   */
  @XmlElement(name = "isdriver")
  protected void setDriver(final DriverLicense driverLicence) {
    this.setDriver(driverLicence);
  }
  
  /**
   * @return workStatus
   * workStatus of agent
   */
  @Pure
  protected WorkStatus getWorkStatus() {
    return this.workStatus;
  }
  
  /**
   * @param workStatus
   * workStatus of  agent
   */
  @XmlElement(name = "workStatus")
  protected void setWorkStatus(final WorkStatus workStatus) {
    this.workStatus = workStatus;
  }
  
  /**
   * @return houseHoldAge
   * houseHoldAge of agent
   */
  @Pure
  protected HouseholdAge getHouseHoldAge() {
    return this.houseHoldAge;
  }
  
  /**
   * @param houseHoldAge
   * houseHoldAge of  agent
   */
  @XmlElement(name = "houseHoldAge")
  protected void setHouseHoldAge(final HouseholdAge houseHoldAge) {
    this.houseHoldAge = houseHoldAge;
  }
  
  /**
   * @return houseHoldComposition
   * houseHoldComposition of agent
   */
  @Pure
  protected HouseholdComposition getHouseHoldComposition() {
    return this.houseHoldComposition;
  }
  
  /**
   * @param houseHoldComposition
   * houseHoldComposition of  agent
   */
  @XmlElement(name = "houseHoldComposition")
  protected void setHouseHoldComposition(final HouseholdComposition houseHoldAgeComposition) {
    this.houseHoldComposition = houseHoldAgeComposition;
  }
  
  /**
   * @return ChildrenCategory
   * ChildrenCategory in the agent house
   */
  @Pure
  protected ChildrenCategory getChildrenCategory() {
    return this.childrenCategory;
  }
  
  /**
   * @param ChildrenCategory
   * ChildrenCategory in the agent house
   */
  @XmlElement(name = "childrenCategory")
  protected void setChildrenCategory(final ChildrenCategory childrenCategory) {
    this.childrenCategory = childrenCategory;
  }
  
  /**
   * @return incomeCategory
   * incomeCategory in the agent house
   */
  @Pure
  protected IncomeCategory getIncomeCategory() {
    return this.incomeCategory;
  }
  
  /**
   * @param incomeCategory
   * incomeCategory in the agent house
   */
  @XmlElement(name = "incomeCategory")
  protected void setIncomeCategory(final IncomeCategory incomeCategory) {
    this.incomeCategory = incomeCategory;
  }
  
  @Extension
  @ImportedCapacityFeature(Behaviors.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Behaviors.class, ($0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || $0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = $0$getSkill(Behaviors.class)) : $0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS)", imported = Behaviors.class)
  private Behaviors $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = $getSkill(Behaviors.class);
    }
    return $castSkill(Behaviors.class, this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
  }
  
  @Extension
  @ImportedCapacityFeature(DefaultContextInteractions.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(DefaultContextInteractions.class, ($0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || $0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = $0$getSkill(DefaultContextInteractions.class)) : $0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS)", imported = DefaultContextInteractions.class)
  private DefaultContextInteractions $CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = $getSkill(DefaultContextInteractions.class);
    }
    return $castSkill(DefaultContextInteractions.class, this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS);
  }
  
  @Extension
  @ImportedCapacityFeature(NativeCapacity.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(NativeCapacity.class, ($0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || $0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) ? ($0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = $0$getSkill(NativeCapacity.class)) : $0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY)", imported = NativeCapacity.class)
  private NativeCapacity $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER() {
    if (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) {
      this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = $getSkill(NativeCapacity.class);
    }
    return $castSkill(NativeCapacity.class, this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY);
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ConfirmInitiator(final ConfirmInitiator occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ConfirmInitiator$3(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$EndRenegotiation(final EndRenegotiation occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$EndRenegotiation$4(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$perturbation(final perturbation occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    if ($behaviorUnitGuard$perturbation$1(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$1(occurrence));
    }
    if ($behaviorUnitGuard$perturbation$2(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$2(occurrence));
    }
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (other.id != this.id)
      return false;
    if (!java.util.Objects.equals(this.name, other.name)) {
      return false;
    }
    if (other.age != this.age)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.id;
    result = prime * result + java.util.Objects.hashCode(this.name);
    result = prime * result + this.age;
    return result;
  }
  
  @SyntheticMember
  public Person(final UUID parentID, final UUID agentID) {
    super(parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  @Deprecated
  public Person(final BuiltinCapacitiesProvider provider, final UUID parentID, final UUID agentID) {
    super(provider, parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  public Person(final UUID parentID, final UUID agentID, final DynamicSkillProvider skillProvider) {
    super(parentID, agentID, skillProvider);
  }
}
