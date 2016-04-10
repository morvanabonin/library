module.exports = function(grunt) {
    
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),

        less: {
            production: {
                options: {
                    paths: ['dist/css'],
                    compress: true,
                    yuicompress: true,
                    optimization: 2
                },
                files: {
                    'dist/css/allura.min.css':['assets/less/allura.less']
                }
            }
        },
        watch: {
            styles: {
                files: ['assets/less/allura.less'],
                tasks: ['less'],
                options: {
                    nospawn: true
                }
            }
        }
    });

    // Load the plugin that provides the "uglify" task.
  grunt.loadNpmTasks('grunt-contrib-less');
  grunt.loadNpmTasks('grunt-contrib-watch');

  // Default task(s).
  grunt.registerTask('default', ['less', 'watch']);
}