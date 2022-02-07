package br.com.letscode.dependenciasexternas;

public class MainScript {
    public static void main(String[] args) {
        SchoolClass javaClass = new SchoolClass("Turma Java", "src/main/resources/Turma Java.txt");
        javaClass.readClassFile();
        javaClass.printClassData();
        SchoolClass bdClass = new SchoolClass("Turma Banco de Dados", "src/main/resources/Turma Banco de Dados.txt");
        bdClass.readClassFile();
        bdClass.printClassData();
        PrintSchoolData.printTxt(javaClass.getStudentList(), bdClass.getStudentList());
    }
}