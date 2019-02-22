// pages/list/list.js
Page({

  /**
   * Page initial data
   */
  data: {
    list:[]
  },

  /**
   * Lifecycle function--Called when page load页面加载
   */
  onLoad: function (options) {

  },

  /**
   * Lifecycle function--Called when page is initially rendered
   */
  onReady: function () {

  },

  /**
   * Lifecycle function--Called when page show
   */
  onShow: function () {
	  wx.requst({
	      url: "http://127.0.0.1:8082/area/getAreaList",
	      method: 'GET',
	      data: "",
	      success: function(res){
	        var list = res.data.areaList;
	        if(list = null){

	        }
	        else {

	        }
	      }
	    })
  },

  /**
   * Lifecycle function--Called when page hide
   */
  onHide: function () {

  },

  /**
   * Lifecycle function--Called when page unload
   */
  onUnload: function () {

  },

  /**
   * Page event handler function--Called when user drop down
   */
  onPullDownRefresh: function () {

  },

  /**
   * Called when page reach bottom
   */
  onReachBottom: function () {

  },

  /**
   * Called when user click on the top right corner to share
   */
  onShareAppMessage: function () {

  }
})