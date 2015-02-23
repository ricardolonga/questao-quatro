package br.com.ricardolonga;

public class RelatorioHorasProjeto extends Relatorio {

    @Override
    public void montaRelatorio() {
        super.montaCabecalho();

        System.out.println("Relatorio Horas Projeto...");

        System.out.println("Rodapé 123...");
    }
    
}