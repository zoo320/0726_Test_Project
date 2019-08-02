package ch15.processing.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritSerializeTest {

	public static void main(String[] args) {
		File target = new File("c:/Temp/objParent.dat");
		Child child = new Child("홍길동", 20);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(target));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(target));) {
			//객체 저장
			oos.writeObject(child);
			// 객체 로딩
			Object readed = ois.readObject();
			if (readed != null && readed instanceof Child) {
				Child casted = (Child) readed;
				System.out.println(casted);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	static class Parent{
		protected String name;
	}
	static class Child extends Parent implements Serializable{
		private static final long serialVersionUID = 4261512421193094142L;
		private int age;

		public Child(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Child [age=" + age + ", name=" + name + "]";
		}
		
		private void writeObject(ObjectOutputStream out) throws IOException{
			out.writeUTF(name);
			out.defaultWriteObject();
		}
		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
			name = in.readUTF();
			in.defaultReadObject();
		}
	}
}