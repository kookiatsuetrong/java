import javax.persistence.*;
class Start {
	public static void main(String[] z) {
		Branch b = new Branch();
		b.name = "Siam Square";
		b.area = 75.8;
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("main");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(b);
		manager.getTransaction().commit();
		System.out.println("Success");
	}
}
