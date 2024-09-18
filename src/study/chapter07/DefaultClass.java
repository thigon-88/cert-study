package study.chapter07;

public class DefaultClass implements DefaultInterface1, DefaultInterface2 {

	//Precisa sobrescrever o metodo para definir qual utilizara.
	@Override
	public String teste() {
		// TODO Auto-generated method stub
		return DefaultInterface1.super.teste(); // the way to access members defined in interfaces
	}

}
