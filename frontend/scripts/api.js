/**
 * Envia dados do cliente para uma API via requisição POST.
 * * @param {string} apiUrl - O URL do endpoint da API.
 * @param {object} dadosCliente - Um objeto com os dados do cliente a serem enviados.
 * @returns {Promise<object>} - Uma promessa que resolve com a resposta da API (em JSON).
 * @throws {Error} - Lança um erro se a requisição falhar ou a resposta não for 200 OK.
 */

const API_URL = 'http://localhost:8080/api'

async function cadastrarCliente(dadosCliente) {

    const cliente = JSON.stringify(dadosCliente);

    try {
        const response = await fetch(`${API_URL}/cliente`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: cliente,
        });

        if (!response.ok) {
            throw new Error(`Erro na requisição: ${response.status}`);
        }

        let data = await response.json()

        return data;

    } catch (error) {
        console.error('Falha ao enviar os dados:', error);
        throw error;
    }
}