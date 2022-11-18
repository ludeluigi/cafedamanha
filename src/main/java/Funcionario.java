public class Funcionario {

    private String Nome;
    private String Cpf;


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    @Override
    public boolean equals (Object obj){
        if (!(obj instanceof Funcionario)){
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        //return this.getNome().equals(other.getNome());
        return this.getCpf().equals(other.getCpf());
    }
    @Override
    public String toString(){
        return this.getNome() + " Cpf: " + this.getCpf();
    }
}
