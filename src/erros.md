Erro 1:
    PROBLEMA; O primeiro erro que eu achei foi a falta do this. no construtor
    SOLUCÃO; Eu corrigi colocando this. em cada atributo que estava sem.

Erro 2: 
    PROBLEMA; Estava faltando os setters de salário e nome
    SOLUÇÃO; Então eu apaguei os que ja tinham e adicionei getters e setters de salário e nome.

Erro 3:
    PROBLEMA; O SDK era o errado, pelo menos no meu.
    SOLUÇÃO; Mudei para o de 26, assim deu tudo certo.

Erro 4:
    PROBLEMA; O método estava com muitos "()" e com ; no lugar errado
    SOLUÇÃO; Corrigi retirando o () que tinham a mais e também retirei os ; a mais.

Erro 5:
    PROBLEMA; Eu vi que o percentual havia sido calculado era somente o aumento em dinheiro que foi digitado, no caso no main.java, percentual = 10, o resultado inicial era 3010,00, mas o esperado era 3300,00.
    SOLUÇÃO; Para corrigir coloquei a conta certa. percentual = (getSalario()/100)* percentual, com essa conta o resultado seria o certo.