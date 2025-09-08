document.getElementById('cpf').addEventListener('input', function (e) {
    let value = e.target.value.replace(/\D/g, '');
    value = value.slice(0, 11);

    if (value.length > 9) {
        value = value.replace(/(\d{3})(\d{3})(\d{3})(\d{1,2})/, '$1.$2.$3-$4');
    } else if (value.length > 6) {
        value = value.replace(/(\d{3})(\d{3})(\d{1,3})/, '$1.$2.$3');
    }
    else if (value.length > 3) {
        value = value.replace(/(\d{3})(\d{1,3})/, '$1.$2');
    }

    e.target.value = value;
});

document.getElementById("email").addEventListener("input", function (event) {
    const email = event.target.value;
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        event.target.setCustomValidity("Por favor, insira um email válido.");
    } else {
        event.target.setCustomValidity("");
    }
});

document.getElementById('telefone').addEventListener('input', function (e) {
    let value = e.target.value.replace(/\D/g, '');
    value = value.slice(0, 11);
    // 11933460788
    if (value.length > 7) {
        value = value.replace(/(\d{2})(\d{5})(\d{1,4})/, '($1)$2-$3');
    } else if (value.length > 2) {
        value = value.replace(/(\d{2})(\d{1,4})/, '($1)$2');
    }
    else if (value.length > 1) {
        value = value.replace(/(\d{2})/, '($1)');
    }

    e.target.value = value;

});

document.getElementById('re-senha').addEventListener('input', (e) => {
    const senha = document.getElementById('senha').value

    if (e.target.value !== senha) {
        console.log('senha diferente')
        e.target.setCustomValidity("Senha diferente");

    } else {
        e.target.setCustomValidity("");
    }

})

document.getElementById('form-cadastro-cliente').addEventListener('submit', async (e) => {
    e.preventDefault()
    let telefone = e.target.telefone.value
    const regex = /\((\d+)\)(\d{5})-(\d{4})/
    const resultado = regex.exec(telefone);

    const ddd = resultado[1]
    const numero = resultado[2] + resultado[3]

    const cliente = {
        "nome": e.target.nome.value,
        "genero": e.target.genero.value,
        "dataNascimento": e.target.nascimento.value,
        "cpf": e.target.cpf.value,
        "email": e.target.email.value,
        "password": e.target.senha.value,

        "telefones": [
            {
                "ddd": ddd,
                "numero": numero,
                "tipo": e.target.tipo_telefone.value
            }
        ],
        "enderecoResidencial": {
            "tipoEndereco": "residencial",
            "tipoResidencia": e.target.tipo_residencia.value,
            "tipoLogradouro": e.target.tipo_logradouro.value,
            "logradouro": e.target.logradouro.value,
            "numero": e.target.numero.value,
            "bairro": e.target.bairro.value,
            "cep": e.target.bairro.value,
            "cidade": e.target.cidade.value,
            "estado": e.target.estado.value,
            "pais": e.target.pais.value,
            "observacao": e.target.observacao.value,
        }
    }

    try {
        let response = await cadastrarCliente(cliente)
        if (!response.success) {
            console.log(response)
            alert("Cadastro não realizado!")
        } else {
            alert("Cliente cadastrado com sucesso!")
            window.location.href = '../login'
        }

    } catch (Error) {
        alert("Cliente já cadastrado")
    }
})