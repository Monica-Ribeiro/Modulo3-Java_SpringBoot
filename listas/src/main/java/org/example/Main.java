package org.example;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Monica", 27, 1.71, 60));
        pessoas.add(new Pessoa("Mateus", 25, 1.72, 65));
        pessoas.add(new Pessoa("Miguel", 22, 1.75, 70));
        pessoas.add(new Pessoa("Israel", 28, 1.80, 75));

        List<Pessoa> pesoEaltura = new ArrayList<>();
        for (Pessoa pessoa: pessoas){
            double somaAlturaEPeso = pessoa.getPeso() + pessoa.getAltura();
            if (somaAlturaEPeso > 72){
                pesoEaltura.add(pessoa);
            }
        }

        double maiorSomaPesoEAltura = 0;
        int index = 0;
        for (int i = 0; i < pessoas.size(); i++){
            double somaAtual = pessoas.get(i).getPeso() + pessoas.get(i).getAltura();
            if (somaAtual > maiorSomaPesoEAltura){
                maiorSomaPesoEAltura = somaAtual;
                index = i;
            }
        }

        System.out.println(pessoas.get(index).getNome());


        double somaPeso = 0;
        for (Pessoa pessoa: pessoas){
            if (pessoa.getPeso() % 2 == 0){
                somaPeso = somaPeso + pessoa.getPeso();
            }
        }
        System.out.println("Peso: " + somaPeso);

        int somatorio = 0;
        for (Pessoa pessoa: pessoas){
            somatorio = somatorio + pessoa.getIdade();
        }
        System.out.println(somatorio);


        List<Pessoa> pessoasAPartir70Kg = new ArrayList<>();
        for (Pessoa pessoa: pessoas){
            if (pessoa.getPeso() >= 70){
                pessoasAPartir70Kg.add(pessoa);
            }
        }


        //buscando pessoa com menor idade
        int menorIdade = 100;
        Pessoa pessoaComMenorIdade = null;
        for (Pessoa pessoa: pessoas){
            if(pessoa.getIdade() < menorIdade){
                menorIdade = pessoa.getIdade();
                pessoaComMenorIdade = pessoa;
            }
        }
        System.out.println(pessoaComMenorIdade.getNome());
        System.out.println(pessoaComMenorIdade.getIdade());

        //Criando nova lista
        List<Pessoa> pessoasMaioresQue25 = new ArrayList<>();
        for (int i = 0; i < pessoas.size() ; i++) {
            if (pessoas.get(i).getIdade() > 25){
                pessoasMaioresQue25.add(pessoas.get(i));
            }
        }
        //Criando nova lista de pessoas com idade impar
        List<Pessoa> pessoasComIdadeImpar = new ArrayList<>();
        for (Pessoa pessoa: pessoas){
            if (pessoa.getIdade() % 2 == 1){
                pessoasComIdadeImpar.add(pessoa);
            }
        }
    }
}
