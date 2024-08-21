# Desafio do Iphone:
## Objetivo:
- Estruturar as funcionalidades do aparelho e ferramentas aplicadas no dispositivo no ano 2017 durante a apresentação do renomado Steve Jobs, fundador da Apple, assim segue abaixo um espoço das funcionalidades.

- Reprodutor Musical: tocar, pausar, selecionar musica.
- Aparelho Telefonico: ligar, atender, iniciar Correio de Voz.
- Navegador na Internet: exibir pagina, adicionar nova aba, atualizar pagina

Abaixo verá as funcionalidades mencionadas acima, assim você encontrara no diagrama a classe principal Iphone que representa o Smarthphone com os metodos:
- Reprodutor Musical
- Aparelho Telefonico
- Navegador de Internet
assim também todas as funções que pode ser realizada por meio das mesma.

-------------------------------------------
|                 Iphone                   |
--------------------------------------------
| - reprodutorMusical: ReprodutorMusical   |
| - aparelhoTelefonico: AparelhoTelefonico |
| - navegadorInternet: NavegadorInternet   |
--------------------------------------------

<svg width = "20" height = "20" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><!--!Font Awesome Free 6.6.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path fill="#ffffff" d="M499.1 6.3c8.1 6 12.9 15.6 12.9 25.7l0 72 0 264c0 44.2-43 80-96 80s-96-35.8-96-80s43-80 96-80c11.2 0 22 1.6 32 4.6L448 147 192 223.8 192 432c0 44.2-43 80-96 80s-96-35.8-96-80s43-80 96-80c11.2 0 22 1.6 32 4.6L128 200l0-72c0-14.1 9.3-26.6 22.8-30.7l320-96c9.7-2.9 20.2-1.1 28.3 5z"/></svg>

------------------------------------
|       ReprodutorMusical          |
------------------------------------
| + tocar()                        |
| + pausar()                       |
| + selecionarMusica(nome: String) |
------------------------------------

<svg width = "20" height = "20" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><!--!Font Awesome Free 6.6.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path fill="#00cc0e" d="M164.9 24.6c-7.7-18.6-28-28.5-47.4-23.2l-88 24C12.1 30.2 0 46 0 64C0 311.4 200.6 512 448 512c18 0 33.8-12.1 38.6-29.5l24-88c5.3-19.4-4.6-39.7-23.2-47.4l-96-40c-16.3-6.8-35.2-2.1-46.3 11.6L304.7 368C234.3 334.7 177.3 277.7 144 207.3L193.3 167c13.7-11.2 18.4-30 11.6-46.3l-40-96z"/></svg> 
--------------------------------
|       AparelhoTelefonico     |
--------------------------------
| + ligar(numero: String)      |
| + atender()                  |
| + iniciarCorreioVoz()        |
--------------------------------

<svg width= "20" height="20" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><!--!Font Awesome Free 6.6.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path fill="#63E6BE" d="M483 159.7c10.9-24.6 21.4-60.4 21.4-87.9 0-72.7-79.6-98.4-209.7-38.6-107.6-7.2-211.2 73.7-237.1 186.5 30.9-34.9 78.3-82.3 122-101.2C125.4 166.9 79.1 228 44 291.7 23.2 329.7 0 390.9 0 436.7c0 98.6 92.9 86.5 180.3 42 31.4 15.4 66.6 15.6 101.7 15.6 97.1 0 184.2-54.3 216.8-146H377.9c-52.5 88.6-196.8 53-196.8-47.4H509.9c6.4-43.6-1.7-95.7-26.9-141.2zM64.6 346.9c17.7 51.2 53.7 95.9 100.3 123.3-88.7 48.9-173.3 29.1-100.3-123.3zm116-108.9c2-55.2 50.3-94.9 104-94.9 53.4 0 102 39.7 104 94.9H180.5zm184.5-187.6c21.4-10.3 48.6-22 72.6-22 31.4 0 54.3 21.7 54.3 53.7 0 20-7.4 49-14.6 67.9-26.3-42.3-66-81.6-112.3-99.6z"/></svg>

--------------------------------
|       NavegadorInternet      |
--------------------------------
| + exibirPagina(url: String)  |
| + adicionarNovaAba()         |
| + atualizarPagina()          |
--------------------------------

