const aside = document.querySelector("aside")

if (!!aside) {
    aside.innerHTML = `
    <h1>Painel de controle</h1>

    <nav>
        <h2>Produtos</h2>
        <ul>
            <li><a href="../page/cadastro-produto.html">Novo produto</a></li>
            <li><a href="../page/gestao-produtos.html">Gestão de produtos</a></li>
            <li><a href="../page/controle-estoque.html">Controle de estoque</a></li>
        </ul>

        <h2>Plataformas</h2>
        <ul>
            <li><a href="../page/cadastro-plataforma.html">Adicionar nova plataforma</a></li>
            <li><a href="../page/gestao-plataformas.html">Gestão de plataformas</a></li>
        </ul>

        <h2>Genero</h2>
        <ul>
            <li><a href="../page/cadastro-generos.html">Adicionar novo genero</a></li>
            <li><a href="../page/gestao-generos.html">Gestão de generos de jogos</a></li>
        </ul>

        <h2>Clientes</h2>
        <ul>
            <li><a href="../page/cadastro-cliente.html">Novo cliente</a></li>
            <li><a href="../page/gestao-clientes.html">Gestão de clientes</a></li>
        </ul>
    </nav>
`
}

