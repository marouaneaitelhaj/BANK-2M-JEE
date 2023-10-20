document.addEventListener('DOMContentLoaded', function () {
    const openAddForm = document.getElementById('openAddForm');
    const addForm = document.getElementById('addForm');
    const addOverlay = document.getElementById('addOverlay');
    const closeAddForm = document.getElementById('closeAddForm');
    const deleteOverlay = document.getElementById('deleteOverlay');
    const closeDeleteForm = document.getElementById('closeDeleteForm');
    const updateOverlay = document.getElementById('updateOverlay');
    const closeUpdateForm = document.getElementById('closeUpdateForm');

    openAddForm.addEventListener('click', function (){
        addForm.classList.remove('hidden');
    });
    addOverlay.addEventListener('click', function (event) {
        if (event.target === addOverlay) {
            addForm.classList.add('hidden');
        }
    });
    closeAddForm.addEventListener('click', function (){
        addForm.classList.add('hidden');
    });
    deleteOverlay.addEventListener('click', function (event) {
        if (event.target === deleteOverlay) {
            document.getElementById('deleteForm').classList.add('hidden');
        }
    });
    closeDeleteForm.addEventListener('click', function (){
        document.getElementById('deleteForm').classList.add('hidden');
    });

    updateOverlay.addEventListener('click', function (event) {
        if (event.target === updateOverlay) {
            document.getElementById('updateForm').classList.add('hidden');
        }
    });
    closeUpdateForm.addEventListener('click', function (){
        document.getElementById('updateForm').classList.add('hidden');
    });
});
function populateDelete(code) {
    const deleteForm = document.getElementById('deleteForm');
    document.getElementById('deleteCode').value = code;
    deleteForm.classList.remove('hidden');
}
function populateUpdate(code, firstName, lastName, birthDate, mobile, address) {
    const updateForm = document.getElementById('updateForm');
    document.getElementById('updateCode').value = code;
    document.getElementById('updateFirstName').value = firstName;
    document.getElementById('updateLastName').value = lastName;
    document.getElementById('updateBirthDate').value = birthDate;
    document.getElementById('updateMobile').value = mobile;
    document.getElementById('updateAddress').value = address;
    updateForm.classList.remove('hidden');
}