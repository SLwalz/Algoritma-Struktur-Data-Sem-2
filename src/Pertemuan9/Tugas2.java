package Pertemuan9;

public class Tugas2 {
    int noTran22e, jumlah22e, harga22e;
    String tglBeli22e;
    int size22e, top22e;
    Tugas2 data22e[];

    Tugas2(int noTran22e, int jumlah22e, int harga22e, String tglBeli22e) {
        this.noTran22e = noTran22e;
        this.jumlah22e = jumlah22e;
        this.harga22e = harga22e;
        this.tglBeli22e = tglBeli22e;
    }

    public Tugas2(int size){
        this.size22e = size;
        data22e = new Tugas2[size];
        top22e = -1;
    }

    public boolean isEmpty(){
        if (top22e == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (top22e == size22e-1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Tugas2 x){
        if (!isFull()){
            top22e++;
            data22e[top22e] = x;
        } else {
            System.out.println("Isi Data penuh!!");
        }
    }

    public void pop(){
        if (!isEmpty()){
            Tugas2 x = data22e[top22e];
            top22e--;
            System.out.println("Struk yang diambil: ");
            System.out.println("No Transaksi\tTgl Beli\tJumlah\tTotal Harga");
            System.out.printf("%d\t%s\t%d\t%d\n",x.noTran22e, x.tglBeli22e,
                    x.jumlah22e, x.harga22e);
        } else {
            System.out.println("Data masih kosong");
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Data sudah kosong!!");
        } else {
            System.out.println("Struk terbaru: ");
            System.out.println("No Transaksi\tTgl Beli\tJumlah\tTotal Harga");
            System.out.printf("%d\t%s\t%d\t%d\n",data22e[top22e].noTran22e,
                    data22e[top22e].tglBeli22e, data22e[top22e].jumlah22e,
                    data22e[top22e].harga22e);
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Data sudah kosong!!");
        } else {
            System.out.println("List struk: ");
            System.out.println("No Transaksi\tTgl Beli\tJumlah\tTotal Harga");
            for (int i=top22e; i>=0; i--){
                System.out.printf("%d\t%s\t%d\t%d\n",data22e[i].noTran22e,
                    data22e[i].tglBeli22e, data22e[i].jumlah22e,
                    data22e[i].harga22e);
            }
            System.out.println("");
        }
    }
}
