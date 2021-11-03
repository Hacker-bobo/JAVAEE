import Vue from 'vue'
import './plugins/axios'
import App from './App.vue'
import router from './router'
import axios from 'axios'


axios.defaults.baseURL = 'http://localhost:8081/api'

Vue.prototype.$ajax = axios;
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
