import javax.persistence.*;

@Entity @Table(name="branch")
public class Branch {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int code;
	public String name;
	public double area;
}
