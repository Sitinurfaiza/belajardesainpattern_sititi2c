package Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Employee
        Employee employee = new Employee("1234", "Siti Nur Faiza", 5000.0);

        // Memanggil metode printSalaryReport untuk mencetak laporan gaji
        employee.printSalaryReport();
    }
}
