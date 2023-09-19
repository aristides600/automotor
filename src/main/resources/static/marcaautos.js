Vue.createApp({
    data() {
        return {
            mar_nombre : "",
        }
    },
    methods: {
        async submitForm() {

            const provincia = {
                mar_nombre : this.mar_nombre
            }
            try {
                const response = await fetch('/api/marcavehiculos', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(provincia) 
                });
                if (response.ok) {
                    alert("Localidad creada exitosamente.");
                }
            } catch (error) {
                console.error('Error de red:', error);
            }
            
        }        
    }
}).mount('#app');