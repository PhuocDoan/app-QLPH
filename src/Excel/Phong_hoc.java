package Excel;

import java.util.ArrayList;

public class Phong_hoc {
	String Room;
	String Class;
	String State;
	String Detail;

	public Phong_hoc() {

	}

	public Phong_hoc(String Room, String Class, String State, String Detail) {
		this.Room = Room;
		this.Class = Class;
		this.State = State;
		this.Detail = Detail;
	}

	public void Set_Room(String Room) {
		this.Room = Room;
	}

	public void Set_Class(String Class) {
		this.Class = Class;
	}

	public void Set_State(String State) {
		this.State = State;
	}

	public String get_Room() {
		return Room;
	}

	public String get_Class() {
		return Class;
	}

	public String get_State() {
		return State;
	}
}

class Library<T> {
	public ArrayList<T> arr;

	/**
	 * @return the arr
	 */
	public ArrayList<T> getArr() {
		return arr;
	}

	/**
	 * @param arr
	 *            the arr to set
	 */
	public void setArr(ArrayList<T> arr) {
		this.arr = arr;
	}

	public void addElement(T t) {
		arr.add(t);
	}

	public Library() {
		arr = new ArrayList<T>();
		// TODO Auto-generated constructor stub
	}

}
