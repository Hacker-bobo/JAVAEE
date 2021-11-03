<template>
  <div class="Login">
    <div class="login">
      <div class="picture">
        <img alt="Vue logo" src="../assets/logo.png">
      </div>
      <div class="form">
        <div class="form_id">
          <label for="uid">账号：</label>
          <input type="text" v-model="userInfo.id" name="uid" placeholder="请输入账号">
        </div>
      <div class="form_pwd">
        <label for="upwd">密码：</label>
        <input type="password" v-model="userInfo.pwd" name="upwd" placeholder="请输入密码"> 
        <button @click="handleForm()">login</button>
      </div>
    </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      userInfo:{
        id:'',
        pwd:'',
      },
      
    }
  },
  methods: {
    handleForm() {
      let slef = this;
      this.$ajax({
        method: 'post',
        url: '/login',
        data: slef.userInfo
      }).then(Response=>{
        if(Response.data.statue == 200) {
          this.$router.push({name: 'About',params:{page:Response}})
        }
        else if(Response.data.statue == 100) {
          alert("该用户不存在！")
        }
        else alert("密码错误，请重新输入！")
      }).catch(error=>{
        console.log(error);
      })
    }
  }
}
</script>

<style>
.Login {
  width: 90vw;
  height: 90vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.login {
  width: 36%;
  height: 50%;
  background-color:cyan;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.picture {
  display: flex;
  justify-content: center;
}
</style>
