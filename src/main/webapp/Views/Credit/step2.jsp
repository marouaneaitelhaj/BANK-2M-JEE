<div class="w-2/5 bg-white mx-5 my-5">
    <nav aria-label="Progress">
        <ol role="list" class="divide-y divide-gray-300 rounded-md border border-gray-300 md:flex md:divide-y-0">
            <li class="relative md:flex md:flex-1">
                <!-- Completed Step -->
                <a href="#" class="group flex w-full items-center">
        <span class="flex items-center px-6 py-4 text-sm font-medium">
          <span class="flex h-10 w-10 flex-shrink-0 items-center justify-center rounded-full bg-indigo-600 group-hover:bg-indigo-800">
            <!-- Heroicon name: solid/check -->
            <svg class="h-6 w-6 text-white" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor"
                 aria-hidden="true">
              <path fill-rule="evenodd"
                    d="M19.916 4.626a.75.75 0 01.208 1.04l-9 13.5a.75.75 0 01-1.154.114l-6-6a.75.75 0 011.06-1.06l5.353 5.353 8.493-12.739a.75.75 0 011.04-.208z"
                    clip-rule="evenodd"/>
            </svg>
          </span>
          <span class="ml-4 text-sm font-medium text-gray-900">Simuler mon crédit</span>
        </span>
                </a>

                <!-- Arrow separator for lg screens and up -->
                <div class="absolute top-0 right-0 hidden h-full w-5 md:block" aria-hidden="true">
                    <svg class="h-full w-full text-gray-300" viewBox="0 0 22 80" fill="none"
                         preserveAspectRatio="none">
                        <path d="M0 -2L20 40L0 82" vector-effect="non-scaling-stroke" stroke="currentcolor"
                              stroke-linejoin="round"/>
                    </svg>
                </div>
            </li>
            <li class="relative md:flex md:flex-1">
                <!-- Completed Step -->
                <a href="#" class="group flex w-full items-center">
        <span class="flex items-center px-6 py-4 text-sm font-medium">
          <span class="flex h-10 w-10 flex-shrink-0 items-center justify-center rounded-full bg-indigo-600 group-hover:bg-indigo-800">
            <!-- Heroicon name: solid/check -->
            <svg class="h-6 w-6 text-white" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor"
                 aria-hidden="true">
              <path fill-rule="evenodd"
                    d="M19.916 4.626a.75.75 0 01.208 1.04l-9 13.5a.75.75 0 01-1.154.114l-6-6a.75.75 0 011.06-1.06l5.353 5.353 8.493-12.739a.75.75 0 011.04-.208z"
                    clip-rule="evenodd"/>
            </svg>
          </span>
          <span class="ml-4 text-sm font-medium text-gray-900">Mes coordonnées</span>
        </span>
                </a>

                <!-- Arrow separator for lg screens and up -->
                <div class="absolute top-0 right-0 hidden h-full w-5 md:block" aria-hidden="true">
                    <svg class="h-full w-full text-gray-300" viewBox="0 0 22 80" fill="none"
                         preserveAspectRatio="none">
                        <path d="M0 -2L20 40L0 82" vector-effect="non-scaling-stroke" stroke="currentcolor"
                              stroke-linejoin="round"/>
                    </svg>
                </div>
            </li>


            <li class="relative md:flex md:flex-1">
                <!-- Upcoming Step -->
                <a href="#" class="group flex items-center">
        <span class="flex items-center px-6 py-4 text-sm font-medium">
          <span class="flex h-10 w-10 flex-shrink-0 items-center justify-center rounded-full border-2 border-gray-300 group-hover:border-gray-400">
            <span class="text-gray-500 group-hover:text-gray-900">03</span>
          </span>
          <span class="ml-4 text-sm font-medium text-gray-500 group-hover:text-gray-900">Mes infos personnelles</span>
        </span>
                </a>
            </li>
        </ol>
    </nav>
    <div class="flex items-center w-full flex-col ">
        <div class="w-3/4 py-5">
            <label for="montant" class="block text-sm font-medium text-gray-700">Search for Client</label>
            <input type="text" id="montant" name="montant"
                   class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-5">
            <label for="project" class="block text-sm font-medium text-gray-700">Select Client</label>
            <select id="project" name="project"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm">
                <option value="PRET_PERSONNEL">J’ai besoin d’argent</option>
                <option value="OCCASION">Je finance mon véhicule d’occasion</option>
                <option value="REV">Je Gère mes imprévus</option>
                <option value="CREDIT_AUTOMOBILE">Je finance mon véhicule neuf</option>
                <option value="CREDIT_MENAGE">J’équipe ma maison</option>
            </select>
        </div>
        <div class="w-3/4 py-2">
            <button
                    onclick=""
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm">
                Continuer
            </button>
        </div>
    </div>
</div>