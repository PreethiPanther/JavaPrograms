import java.util.Comparator;

public class Player {
public Player(String name, int age, String game) {
		super();
		this.name = name;
		this.age = age;
		this.game = game;
	}
String name;
int age;
String game;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGame() {
	return game;
}
public void setGame(String game) {
	this.game = game;
}
@Override
public String toString() {
	return "Player [name=" + name + ", age=" + age + ", game=" + game + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Player other = (Player) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}
