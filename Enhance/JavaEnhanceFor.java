
public class JavaEnhanceFor {
    public static void main(String[] args){
        int[] nomor = {10,20,30,40,50,60,70,80,90,100}; // mendeklarasikan array integer variabel "nomor" dengan nilai 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        int sum = 0; // variabel integer "sum" di deklarasikan dengan nilai 0
        for(int num:nomor){
            System.out.println(num);
            sum += num;
        }
        System.out.println(sum);
    }
}

// program ini menggunakan perulangan enhanced for untuk melakukan iterasi pada array bilangan bulat, melakukan beberapa operasi pada setiap elemen, dan menghasilkan hasil akhir.
// Pada setiap iterasi loop, elemen saat ini dalam array di print ke konsol. Nilai elemen juga ditambahkan ke variabel yang "sum" menggunakan operator +=.