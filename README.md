<h1>Abstract Factory em Java</h1>

<p>
Projeto simples em Java utilizando o padrão de projeto Abstract Factory.
</p>

<p>
O sistema cria componentes gráficos diferentes para Windows e Linux, como:
</p>

<ul>
  <li>Botão</li>
  <li>Janela</li>
</ul>

<p>
A criação dos objetos é feita através de fábricas, evitando criar os componentes diretamente na classe principal.
</p>

<h2>Tecnologias</h2>

<ul>
  <li>Java</li>
</ul>

<h2>Estrutura</h2>

<ul>
  <li>Interface Botao</li>
  <li>Interface Janela</li>
  <li>Classes Windows e Linux</li>
  <li>Fábricas para cada sistema operacional</li>
  <li>Classe principal Main</li>
</ul>

<h2>Como executar</h2>

<p>1. Compile o arquivo:</p>

<pre>
javac Main.java
</pre>

<p>2. Execute:</p>

<pre>
java Main
</pre>
