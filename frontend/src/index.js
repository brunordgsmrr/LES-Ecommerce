document.getElementById("formCadastro").addEventListener("submit", function (event) {
    event.preventDefault();
    alert("Cadastro realizado com sucesso!");
    history.back()
    //window.location.href = "../index.html";
});

async function getClientes() {
    try {
        const response = await fetch("../data.json"); // carrega o arquivo
        if (!response.ok) {
            throw new Error("Erro ao carregar o arquivo JSON");
        }
        const data = await response.json(); // converte para objeto JS
        return data; // retorna a lista de clientes
    } catch (error) {
        console.error("Erro:", error);
        return [];
    }
}

async function getClienteExample() {

    const data = await getClientes();
    console.log(data);

    const form = document.getElementById("formCadastro");

    form.nome.value = data[0].nome;
    form.genero.value = data[0].genero;
    form.nascimento.value = data[0].data_nascimento;
    form.cpf.value = data[0].cpf;
    form.telefone.value = data[0].telefone;
    form.email.value = data[0].email;
    form.senha.value = data[0].senha;

    //endereço
    form.tipo_endereco.value = data[0].endereco.tipo_endereco;
    form.tipo_logradouro.value = data[0].endereco.tipo_logradouro;
    form.logradouro.value = data[0].endereco.logradouro;
    form.numero.value = data[0].endereco.numero;
    form.cep.value = data[0].endereco.cep;
    form.bairro.value = data[0].endereco.bairro;
    form.cidade.value = data[0].endereco.cidade;
    form.estado.value = data[0].endereco.estado;
    form.pais.value = data[0].endereco.pais;
}

