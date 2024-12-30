function redirectToLogin() {
    window.location.href = '/login';
}

function openProject(projectId) {
    window.location.href = `/project/${projectId}`;
}

function createNewProject() {
    window.location.href = '/project/new';
}
