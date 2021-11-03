module.exports = {
  presets: [
    '@vue/cli-plugin-babel/preset'
  ],
  devServer: {
    proxyTable: {
      '/api': {
        target: 'http://localhost:8081',
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
  }
  
}
}
