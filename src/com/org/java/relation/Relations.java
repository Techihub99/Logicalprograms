/*
 * public class Relations {
 * 
 * }
 */

/*@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Laptop {
	
	@Id
	private int laptopId;
	private String laptopName;
	private String modelName;
	private double price;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "lap_charger")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})   //note opisiteside just add @ManyToOne Annotation 
	private Charger charger;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="Student_course_Table",joinColumns = {@JoinColumn(name="studentId",referencedColumnName = "studentId")},
		inverseJoinColumns= {@JoinColumn(name="courseId",referencedColumnName = "courseId")})
	@JsonManagedReference
	private List<Course> courses;  
	
	  //opisite side 
	   * 
    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Student> students;
	
	
	*/





//OneToOne-->{"laptopId":502,"laptopName":"SONY","modelName":"Model2023","price":72000.0,
//"charger":{"chargerId":202,"chargerType":"A-TYPE","modelName":"C2025","price":25500}}