package Entity;

public class Dimas07161_PelangganToko extends Dimas07161_ManusiaAbstract{

    public int id;
    private String email;
            
    public Dimas07161_PelangganToko() {
    }

    @Override
    public String getNo_ktp() {
        return no_ktp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
