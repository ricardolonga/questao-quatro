package br.com.ricardolonga;

/*
 * Resolva estes três problemas:
 *
 * - O código do Rodapé está repetido nas sub-classes de Relatorio;
 * - A sequência de chamadas das operações está repetida nas sub-classes de Relatorio;
 * - Não há garantia contra o esquecimento da chamada de alguma das operações (RelatorioFinanceiro esqueceu de chamar a montagem do cabeçalho).
 */
public class Aplicacao {

    public static void main(String[] args) {
        Relatorio relatorioFinanceiro = new RelatorioFinanceiro();
        
        relatorioFinanceiro.montaRelatorio();
        
        Relatorio relatorioHorasProjeto = new RelatorioHorasProjeto();
        
        relatorioHorasProjeto.montaRelatorio();
    }
    
}


