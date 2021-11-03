<template>
  <div class="about">
    <h1>欢迎您！</h1>
    <h2>来自<span> {{address}}</span>的 {{name}}</h2>
  </div>
</template>

<script>
export default {
  data() {
    return {
      address:this.$route.params.page.data.user.card.address,
      name:this.$route.params.page.data.user.name
    }
  }
}
</script>
