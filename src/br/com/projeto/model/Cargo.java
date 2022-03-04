package br.com.projeto.model;

public enum Cargo implements Comissao {

    Estoquista {
        @Override
        public double calcularComissao(double valorDaVenda) {
            return valorDaVenda * 0.1;
        }
    },

    Caixa {
        @Override
        public double calcularComissao(double valorDaVenda) {
            return valorDaVenda * 0.15;
        }
    },
    Vendedor {
        @Override
        public double calcularComissao(double valorDaVenda) {
            return valorDaVenda * 0.2;
        }
    },

    Gerente {
        @Override
        public double calcularComissao(double valorDaVenda) {
            return valorDaVenda * 0.25;
        }
    };


}

