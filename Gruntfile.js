module.exports = function(grunt) {
    'use strict';
    
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
        concat: {
            bootstrap: {
                src: ['assets/libs/jquery/jquery-1.12.3.js','node_modules/bootstrap/dist/js/bootstrap.js'],
                dest: 'assets/js/bootstrap.js',
            },
            angular: {
                src: ['node_modules/angular/angular.js', 'node_modules/angular-route/angular-route.js'],
                dest: 'assets/libs/angular/angular.js'
            }
        },
        uglify: {
            options: {
                compress: {
                    warnings: false
                },
                mangle: true,
                preserveComments: /^!|@preserve|@license|@cc_on/i
            },
            core: {
                src: '<%= concat.bootstrap.dest %>',
                dest: 'dist/js/bootstrap.min.js'
            },
            angular: {
                src: '<%= concat.angular.dest %>',
                dest: 'dist/js/angular.min.js'
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
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-watch');


    // Default task(s).
    grunt.registerTask('dev', ['less', 'concat', 'uglify', 'watch']);
    grunt.registerTask('default', ['less', 'concat', 'uglify']);
}