package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.ChildrenCategory;
import fr.utbm.info.ia51.ar.requirements.DriverLicense;
import fr.utbm.info.ia51.ar.requirements.Gender;
import fr.utbm.info.ia51.ar.requirements.HouseholdAge;
import fr.utbm.info.ia51.ar.requirements.HouseholdComposition;
import fr.utbm.info.ia51.ar.requirements.IncomeCategory;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import fr.utbm.info.ia51.ar.requirements.WorkStatus;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * We describe here all informations about the person agent
 * @author Koffi Agbenya
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class PersonnalInfo {
  private List<Schedule> schedules;
  
  private int id;
  
  private String name;
  
  private int age;
  
  private Gender gender;
  
  private DriverLicense driver;
  
  private WorkStatus workStatus;
  
  private HouseholdAge houseHoldAge;
  
  private HouseholdComposition houseHoldComposition;
  
  private ChildrenCategory childrenCategory;
  
  private IncomeCategory incomeCategory;
  
  /**
   * @return id
   * id of agent
   */
  @Pure
  public int getId() {
    return this.id;
  }
  
  /**
   * @param id
   * id of  agent
   */
  @XmlElement(name = "id")
  public void setId(final int id) {
    this.id = id;
  }
  
  /**
   * @return name
   * name of agent
   */
  @Pure
  public String getName() {
    return this.name;
  }
  
  /**
   * @param name
   * name of  agent
   */
  @XmlElement(name = "name")
  public void setName(final String name) {
    this.name = name;
  }
  
  /**
   * @return gender
   * gender of agent
   */
  @Pure
  public Gender getGender() {
    return this.gender;
  }
  
  /**
   * @param gender
   * gender of  agent
   */
  @XmlElement(name = "gender")
  public void setGender(final Gender gender) {
    this.gender = gender;
  }
  
  /**
   * @return age
   * age of agent
   */
  @Pure
  public int getAge() {
    return this.age;
  }
  
  /**
   * @param age
   * age of  agent
   */
  @XmlElement(name = "age")
  public void setAge(final int age) {
    this.age = age;
  }
  
  /**
   * @return driver licence
   * verify if the agent has a driver licence
   */
  @Pure
  public DriverLicense isDriver() {
    return this.driver;
  }
  
  /**
   * @param driver licence
   * if driver licence   agent
   */
  @XmlElement(name = "driver")
  public void setDriver(final DriverLicense driverLicence) {
    this.driver = driverLicence;
  }
  
  /**
   * @return workStatus
   * workStatus of agent
   */
  @Pure
  public WorkStatus getWorkStatus() {
    return this.workStatus;
  }
  
  /**
   * @param workStatus
   * workStatus of  agent
   */
  @XmlElement(name = "workStatus")
  public void setWorkStatus(final WorkStatus workStatus) {
    this.workStatus = workStatus;
  }
  
  /**
   * @return houseHoldAge
   * houseHoldAge of agent
   */
  @Pure
  public HouseholdAge getHouseHoldAge() {
    return this.houseHoldAge;
  }
  
  /**
   * @param houseHoldAge
   * houseHoldAge of  agent
   */
  @XmlElement(name = "houseHoldAge")
  public void setHouseHoldAge(final HouseholdAge houseHoldAge) {
    this.houseHoldAge = houseHoldAge;
  }
  
  /**
   * @return houseHoldComposition
   * houseHoldComposition of agent
   */
  @Pure
  public HouseholdComposition getHouseHoldComposition() {
    return this.houseHoldComposition;
  }
  
  /**
   * @param houseHoldComposition
   * houseHoldComposition of  agent
   */
  @XmlElement(name = "houseHoldComposition")
  public void setHouseHoldComposition(final HouseholdComposition houseHoldAgeComposition) {
    this.houseHoldComposition = houseHoldAgeComposition;
  }
  
  /**
   * @return ChildrenCategory
   * ChildrenCategory in the agent house
   */
  @Pure
  public ChildrenCategory getChildrenCategory() {
    return this.childrenCategory;
  }
  
  /**
   * @param ChildrenCategory
   * ChildrenCategory in the agent house
   */
  @XmlElement(name = "childrenCategory")
  public void setChildrenCategory(final ChildrenCategory childrenCategory) {
    this.childrenCategory = childrenCategory;
  }
  
  /**
   * @return incomeCategory
   * incomeCategory in the agent house
   */
  @Pure
  public IncomeCategory getIncomeCategory() {
    return this.incomeCategory;
  }
  
  /**
   * @param incomeCategory
   * incomeCategory in the agent house
   */
  @XmlElement(name = "incomeCategory")
  public void setIncomeCategory(final IncomeCategory incomeCategory) {
    this.incomeCategory = incomeCategory;
  }
  
  /**
   * @return  List<Schedule>
   * List of Schedule of agent
   */
  @Pure
  public List<Schedule> getSchedules() {
    return this.schedules;
  }
  
  /**
   * @param List<Schedule>
   * List of Schedule of the agent
   */
  @XmlElement(name = "schedules")
  public void setSchedules(final List<Schedule> Schedules) {
    this.schedules = Schedules;
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
    PersonnalInfo other = (PersonnalInfo) obj;
    if (other.id != this.id)
      return false;
    if (!Objects.equals(this.name, other.name)) {
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
    result = prime * result + Objects.hashCode(this.name);
    result = prime * result + this.age;
    return result;
  }
  
  @SyntheticMember
  public PersonnalInfo() {
    super();
  }
}
