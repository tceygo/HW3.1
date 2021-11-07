package sample;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Олександр", "Іваненко", HumanSex.MALE, 34,"МЕ-3", "Економіки і менеджменту", 1345);
		student1.inform();
		Group p = new Group();
		System.out.println(p.toString());
		System.out.println(p.toString());
		p.addStudent(new Student("Галина", "Коваленко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1346));
		System.out.println(p.getMe3()[9]);
		p.addStudent(new Student("Аліна", "Іваненко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1347));
		p.addStudent(new Student("Катерина", "Карпенко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1348));
		p.dellStudent(1348L);
		p.addStudent(new Student("Віталій", "Боднар", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1349));
		p.addStudent(new Student("Антон", "Антоненко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1350));
		p.addStudent(new Student("Богдана", "Мірошніченко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1351));
		p.dellStudent(1349L);
		p.addStudent(new Student("Ігор", "Гармаш", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1352));
		p.addStudent(new Student("Микола", "Задериборода", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1353));
		p.addStudent(new Student("Олександр", "Бортко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1354));
		p.dellStudent(1352L);
		p.addStudent(new Student("Каріна", "Марко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1355));
		p.addStudent(new Student("Борис", "Тетерук", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1356));
		p.addStudent(new Student("Кіндрат", "Партко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1357));
		p.addStudent(new Student("Люк", "Скайвокер", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1358));
		p.dellStudent(1345L);
		System.out.println(p.getMe3()[0]);
		System.out.println(p.searchStudent("Скайвокер"));
		p.addStudent(new Student("Джон", "Котигорошко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1358));
	}

}
