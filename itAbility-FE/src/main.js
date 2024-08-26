import { createApp } from 'vue'
import App from 'itAbility-FE/src/App.vue'
import router from "../router/router.js";

const app = createApp(App)


app.use(router)
app.mount('#app')
