package model;

//TODO Criar Builder
public class Endereco {

    private int id;
    private String rua;
    private String cep;
    private int numero;
    private String complemento;
    private String bairro;

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public static EnderecoBuilder builder(){ return new EnderecoBuilder(); }

    public static class EnderecoBuilder {
        private int id;
        private String rua;
        private String cep;
        private int numero;
        private String complemento;
        private String bairro;

        private EnderecoBuilder() {}

        public EnderecoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public EnderecoBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Endereco build() { return new Endereco(this); }
    }

    private Endereco(EnderecoBuilder builder) {
        this.id = builder.id;
        this.rua = builder.rua;
        this.cep = builder.cep;
        this.numero = builder.numero;
        this.complemento = builder.complemento;
        this.bairro = builder.bairro;
    }


}
