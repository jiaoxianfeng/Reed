<template>
  <div class="hello">
    <!--<h1>{{name}}</h1>-->
    <!--<h2>{{ btnState? 'true':'false' }}</h2>-->
    <!--<button v-on:click="changeName" v-bind:disabled="btnState">-->
      <!--Change Name-->
    <!--</button>-->

    <div class="holder">

      <form @submit.prevent="addSkill">
        <input type="text" placeholder="Enter a skill you have.." v-model="skill" v-validate="'min:5'" name="skill">
        <transition name="alert-in" enter-active-class="animated flipInX" leave-active-class="animated flipOutX">
          <p class="alert" v-if="errors.has('skill')">{{ errors.first('skill') }}</p>
        </transition>
      </form>

      <ul>
        <transition-group name="list" enter-active-class="animated shake" leave-active-class="animated headShake">
          <li v-for="(data, index) in skills" :key='index'>
            {{index}}. {{data.skill}}
            <i class="fa fa-minus-circle" v-on:click="remove(index)"></i>
          </li>

        </transition-group>
      </ul>

      <p>These are the skills that you possess.</p>
    </div>
    <!--<p v-if="skills.length >= 1"> >= 1</p>-->
    <!--<p v-else> 1 </p>-->
    <!--<div v-bind:class="alertObject"></div>-->
    <!--<div v-bind:style="{ backgroundColor: bgColor, width: bgWidth, height: bgHeight }"></div>-->

  </div>
</template>

<script>
export default {
  name: 'Search',
  data () {
    return {
      skill: '',
      name: 'Alphonse',
      btnState: true,
      skills: [
        { 'skill': 'Vue.js' },
        { 'skill': 'Frontend Developer' }
      ],
      alertObject: {
        alert: true,
        'another-class': true
      },
      bgColor: 'green',
      bgWidth: '100%',
      bgHeight: '30px'
    }
  },
  methods: {
    addSkill () {
      this.$validator.validateAll().then((result) => {
        if (result) {
          this.skills.push({skill: this.skill});
          this.skill = '';
        } else {
          console.log('Not valid');
        }
      })
    },
    remove (id) {
      this.skills.splice(id, 1);
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "https://cdn.jsdelivr.net/npm/animate.css@3.5.1";
  @import "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css";
  .alert {
    background: #fdf2ce;
    font-weight: bold;
    display: inline-block;
    padding: 5px;
    margin-top: -20px;
  }

  .holder {
    background: #fff;
  }

  ul {
    margin: 0;
    padding: 0;
    list-style-type: none;
  }

  ul li {
    padding: 20px;
    font-size: 1.3em;
    background-color: #E0EDF4;
    border-left: 5px solid #3EB3F6;
    margin-bottom: 2px;
    color: #3E5252;
  }

  p {
    text-align:center;
    padding: 30px 0;
    color: gray;
  }

  i {
    text-align: right;
  }

  .container {
    box-shadow: 0px 0px 40px lightgray;
  }

  input {
    width: calc(100% - 40px);
    border: 0;
    padding: 20px;
    font-size: 1.3em;
    background-color: #323333;
    color: #687F7F;
  }

  .alert-in-enter-active {
    animation: bounce-in .5s;
  }
  .alert-in-leave-active {
    animation: bounce-in .5s reverse;
  }
  @keyframes bounce-in {
    0% {
      transform: scale(0);
    }
    50% {
      transform: scale(1.5);
    }
    100% {
      transform: scale(1);
    }
  }
</style>
